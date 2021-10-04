import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

val sc = Scanner(System.`in`)

fun main(){
    //Task_2();
}

fun Task_1(){
    var a: Float = sc.nextFloat();
    var result = 4*a;
    println(result);
}

fun Task_2() {
    var a: Float = sc.nextFloat();
    var result = a.pow(2);
    println(result);
}

fun Task_3() {
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();
    val s = a*b;
    val p = 2*(a+b)
    println("S=$s! P=$p");
}

fun Task_4() {
    var d: Float = sc.nextFloat();
    val l = Math.PI*d;
    println("L: $l");
}

fun Task_5() {
    var a: Float = sc.nextFloat();
    var v = a.pow(3);
    var s = 6 * a.pow(2);
    println("V: $v! S: $s!");
}

fun Task_6() {
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();
    var c: Float = sc.nextFloat();
    var v = a*b*c;
    var s = 2*(a*b + a*c + b*c);
    println("V: $v! S: $s!");
}

fun Task_7() {
    var r: Float = sc.nextFloat();
    var l = 2 * Math.PI * r;
    var s = Math.PI * r.pow(2);
    println("l: $l! S: $s!");
}

fun  Task_8() {
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();
    var c = (a+b)/2;
    println("c: $c");
}

fun Task_9(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var c = Math.sqrt((a+b).toDouble());
    println("c: $c:");
}

fun Task_10(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var a2 = a.pow(2);
    var b2 = b.pow(2);

    println("c+d: ${a2+b2}:");
    println("c-d: ${a2-b2}:");
    println("c: ${a2*b2}");
    println("c: ${a2/b2}:");
}

fun Task_11(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var c = sqrt((a.pow(2) + b.pow(2)));
    var p = a+b+c;
    println("p: $p");
}

fun Task_12(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var s1 = Math.PI * a.pow(2);
    var s2 = Math.PI * b.pow(2);

    var s3 = s1 - s2;

    println("s1: $s1");
    println("s2: $s2");
    println("s2: $s3");
}

fun Task_13(){
    var l: Float = sc.nextFloat();
    var r = l/(2*Math.PI);
    var s = Math.PI * r.pow(2);

    println();
}