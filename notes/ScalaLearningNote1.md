
## 《快学Scala》 第一章 Note

### 声明变量 

可变变量 var
常量，不可变 val
没有分号， 
```scala
//带 指定类型的变量 
val greeting: String = "hello"

val answer = 8*5+1 

println(1.to(10))
println(1.toString())
//输出：
//Range 1 to 10
//1
```
### 常用类型
七种数值类型：
- Int
- Byte
- Char
- Short
- Long
- Float
- Double
 
 **都是类**
 
 ### 算术和操作符重载
 
 算术操作符和Java中一样的效果， 但是他们都是方法
 
 a+b 等于 a.+(b)
 
 **Scala没有自增**
 scala中的自增： count += 1 
 
 **Scala可以定义（重载）操作符**
 
 ###方法调用
 
 如果一个无参方法不修改对象， 调用时不需要写括号！
 ```scala
"Bonjour".sorted
``` 
引入包
```scala
import scala.math._ // _字符 相当于 Java中的*
``` 

**类都有一个伴生对象 companion object 其方法和Java中的静态方法一样**

s是一个字符串， s(i) 表示 该字符串中的第i个字符 （java中 s.charAt(i)）
```scala
val a = "hello"
s(4) // 'o'

```
可以当作 ()操作符重载，  背后的原理 是 apply 的方法。 
StringOps类的文档中， 
```scala
def apply(n: Int): Char

s(4) //相当于 s.apply(4)
```
"Bonjour".sorted(3) 会报错 
"Bonjour".sorted.apply(3) 是对的；

