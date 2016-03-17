# hiraganaedittext
A custom EditText for Android that convert any typing from any IME into the corresponding Hiragana text.
![alt tag](https://raw.githubusercontent.com/jehutyno/hiraganaedittext/master/hiraganaedittext_example.png)

## Gradle
If not present, add this repository to your build.gradle :
```gradle
repositories {
    maven { url "https://jitpack.io" }
}
```
And then add the dependency for this project:
```gradle
dependencies {
    compile 'com.github.jehutyno:hiraganaedittext:1.0.0'
}
```

## Use
Then use the widget in your layout as if it was an EditText:
```xml
    <com.jehutyno.hiraganaedittext.HiraganaEditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:inputType="textNoSuggestions|textVisiblePassword"
        android:hint="Type your japanese here" />
```
Use **android:inputType="textNoSuggestions|textVisiblePassword"** to be sure you don't display any suggestions.
