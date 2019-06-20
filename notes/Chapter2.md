
# Chapter 2 控制结构和函数

### 条件表达式 if/else

**Scala中的if/else表达式是有值的**

```scala

if(x>0) 1 else -1
// 表达式的值是 1 或 -1
```
等于 
```java
 x > 0 ? 1:-1;
```
Scala每个表达式都有类型，  上面表达式类型式 Int

```scala
if(x>0) "positive" else -1
```
上述两个分支， 一个类型是java.lang.String， 一个是Int.  他们公共超类是 Any。
所以，上述表达式的类型是 Any

```scala
if(x>0) 1  
//等同于 
if(x>0) 1 else ()
```
else部分 缺失， 则上述表达式 （）部分 类型是 Unit。 等于Java中的void 

### 语句终止 

Scala中不需要 分号 结束。 可以同上下文中推测出来。 

如果单行中 需要多个语句，则需要用分号隔开。 
***Scala程序员倾向于使用 Kernighan & Ritchie 风格花括号***
```scala
if(n>0){
  r = r * n
  n -= 1
}
```
### 块表达式和赋值

Scala中{} 块包含一系列表达式， 结果也是一个表达式， 块中最后一个表达式就是块的值。 

Scala中 赋值动作 本身是没有值的
```scala
{r = r * n ; n -= 1}
```
值的类型是 Unit
***赋值语句不要连在一起 赋值***
```scala
x = y = 1  // 错的 
```

###循环

```scala
   for(i <- 1 to 10){
      println(i)
    }
```

###高级循环

```scala
for (i <- 1 to 3; j <- 1 to 3) print(f"${10 * i +j}%3d")
// 11 12 13 21 22 23 31 32 33
```

###函数



