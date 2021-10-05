import java.util.Scanner
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
Task_4();
}

private fun Task_1(){
    val m = sc.nextInt();
    val k: Int = m/1000;

    println(k);
}

private fun Task_2(){
    val b = sc.nextInt();
    val kb: Int = b/1024;

    println(kb);
}

private fun Task_3(){
    val n = sc.nextInt();

    val a: Int = n/10;
    val b = n%10
    val s = a+b;
    val d = a*b;

    println("Sum: $s\nMult: $d");
}

private fun Task_4(){
    val n = sc.nextInt();
    val a: Int = n/100;
    val b: Int = (n/10)%10;

    val c = n%10;
    val m = b*100+c*10+a*1;
    println(m);
}

private fun Task_5(){
    val n = sc.nextInt();
    val a: Int = n/100;
    val b: Int = (n/10)%10;

    val c = n%10;
    val m = b*100+c*10+a*1;
    println(m);
}

private fun Task_6(){
    val n = sc.nextInt();
    val m: Int = (n/100)%10;
    println(m);
}

private fun Task_7(){
    val n = sc.nextInt();
    val k: Int = n/60;

    println(k);
}

private fun Task_8(){
    val n = sc.nextInt();
    val k: Int = (n%3600) / 60;
    println(k);
}

private fun Task_9(){
    val k = sc.nextInt();
    val d = (k+3)%7;
    println(d);
}

private fun Task_10(){
    val n = sc.nextInt();
    val s: Int = (n/100)+1;
    println(s);
}

