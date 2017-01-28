package net.styleru.i_komarov.lyceumlection1overview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Это приложение является навигатором по всем темам, затронутым на лекции
 * В документирующих комментариях будут пояснения
 * */

/**
 * MainActivity - класс, автоматически сгенерированный Android Studio при создании нового проекта
 * Наследуется от производного от Activity класса, в данном случае - AppCompatActivity
 * В манифесте можно увидеть следующий блок внутри <activity></activity> блока, описывающего данную активность:
 * <intent-filter>
 * <action android:name="android.intent.action.MAIN" />
 * <category android:name="android.intent.category.LAUNCHER" />
 * </intent-filter>
 * ACTION_MAIN - показывает, что данная активность является входной точкой в приложение
 * CATEGORY_LAUNCHER - показывает, что в списке недавно открытых приложений будет показана иконка данной активности.
 * Если иконка не обозначена - будет использована иконка из <application></application> блока
 */
public class MainActivity extends AppCompatActivity {

    private TextView echoOutputHolder;
    private EditText echoInputHolder;

    /**
     * onCreate - метод, который является входной точкой для начала взаимодействия с активностью.
     * Внутри его тела следует обязательно вызвать метод суперкласса
     * После вызова super.onCreate следует метод setContentView, который связывает активность с ее View-представлением,
     * представленным xml-файлом разметки
     *
     * @param savedInstanceState аргумент, который (при наличии) представляет собой прежде сохраненное состояние данной активности
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Здесь же можно найти наши View-компоненты по их идентификаторам, для дальнейшей работы с ними
         * Примечание - данные действия нужно выполнять лишь после того, как мы связали активность с ее View-представлением,
         * вызвав метод setContentView
         * */

        /**
         * В директории layout можно увидеть примеры работы с различными типами layout-ов
         * */

        echoOutputHolder = (TextView) findViewById(R.id.text_view_echo_output);
        echoInputHolder = (EditText) findViewById(R.id.edit_text_echo_input);

        /**
         * Добавим прослушку текста, который вводит пользователь и будем отображать его внутри нашего TextView
         * */

        echoInputHolder.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                /**
                 * Выставляем текст, который был вбит в EditText в TextView
                 * */
                echoOutputHolder.setText(s.toString());
            }
        });
    }

    /**
     * Данный коллбэк является входной точкой в фазу видимости активности для пользователя
     * Также следует обязательно вызвать метод суперкласса, как и почти во всех остальных коллбэках жизненного цикла компонентов Android
     */
    @Override
    public void onStart() {
        super.onStart();
    }

    /**
     * Данный коллбэк является входной точкой, которая показывает, что активность перешла в foreground
     */
    @Override
    public void onResume() {
        super.onResume();
    }

    /**
     * Выход активности из foreground
     */
    @Override
    public void onPause() {
        super.onPause();
    }

    /**
     * Выход из видимости пользователя
     * */
    @Override
    public void onStop() {
        super.onStop();
    }

    /**
     * Коллбэк, который триггерится перед уничтожением активности
     * */
    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
