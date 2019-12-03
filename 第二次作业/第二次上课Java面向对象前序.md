## Java面向对象前序

##### 何为方法？



##### Java StringBuffer 和 StringBuilder 类

当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。

和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。

StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。

由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

整理者注：也就是说就算StringBuilder线程不安全，但是我们仍然用得更多，而在实际的应用开发场景中，也提供了方法让StringBuilder变成线程安全的。

##### 命名规则：

类：大驼峰，首字母大写，多个单词组成时所有单词首字母大写，如：Animal、Person、MyFirstClass...

方法和变量名：小驼峰，首字母小写，出现多个单词除第一个单词以外其余的单词首字母大写，如：getName()、getAge()、setWeight()、stringBuilder、stringBuffer...

可以参考这篇文章：<https://www.cnblogs.com/zshibo/p/8007123.html>

