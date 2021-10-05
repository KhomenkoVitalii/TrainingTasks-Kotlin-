import java.util.Scanner
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

val sc = Scanner(System.`in`)

private fun main(){
    //Task_2();
}

private fun Task_1(){
    var a: Float = sc.nextFloat();
    var result = 4*a;
    println(result);
}

private fun Task_2() {
    var a: Float = sc.nextFloat();
    var result = a.pow(2);
    println(result);
}

private fun Task_3() {
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();
    val s = a*b;
    val p = 2*(a+b)
    println("S=$s! P=$p");
}

private fun Task_4() {
    var d: Float = sc.nextFloat();
    val l = Math.PI*d;
    println("L: $l");
}

private fun Task_5() {
    var a: Float = sc.nextFloat();
    var v = a.pow(3);
    var s = 6 * a.pow(2);
    println("V: $v! S: $s!");
}

private fun Task_6() {
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();
    var c: Float = sc.nextFloat();
    var v = a*b*c;
    var s = 2*(a*b + a*c + b*c);
    println("V: $v! S: $s!");
}

private fun Task_7() {
    var r: Float = sc.nextFloat();
    var l = 2 * Math.PI * r;
    var s = Math.PI * r.pow(2);
    println("l: $l! S: $s!");
}

private fun  Task_8() {
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();
    var c = (a+b)/2;
    println("c: $c");
}

private fun Task_9(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var c = Math.sqrt((a+b).toDouble());
    println("c: $c:");
}

private fun Task_10(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var a2 = a.pow(2);
    var b2 = b.pow(2);

    println("c+d: ${a2+b2}:");
    println("c-d: ${a2-b2}:");
    println("c: ${a2*b2}");
    println("c: ${a2/b2}:");
}

private fun Task_11(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var c = sqrt((a.pow(2) + b.pow(2)));
    var p = a+b+c;
    println("p: $p");
}

private fun Task_12(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var s1 = Math.PI * a.pow(2);
    var s2 = Math.PI * b.pow(2);

    var s3 = s1 - s2;

    println("s1: $s1");
    println("s2: $s2")
    println("s2: $s3");
}

private fun Task_13(){
    var l: Float = sc.nextFloat();
    var r = l/(2*Math.PI);
    var s = Math.PI * r.pow(2);

    println(r);
    println(s);
}

private fun Task_14(){
    var s: Float = sc.nextFloat();
    var r = sqrt(s/Math.PI);
    var d = 2*r;
    var l = 2*Math.PI*r;

    println(d);
    println(l);
}

private fun Task_15(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();
    var c: Float = sc.nextFloat();

    var k = abs(c-a)
    var l = abs(c-b)

    var f = k + l;

    println(k);
    println(l);
    println(f);
}

private fun Task_16(){
    var x1: Float = sc.nextFloat();
    var y1: Float = sc.nextFloat();

    var x2: Float = sc.nextFloat();
    var y2: Float = sc.nextFloat();

    var ab = abs(y2-y1);
    var bc = abs(x2-x1);

    var p = 2*(ab+bc);
    var s = ab*bc;

    println(p);
    println(s);
}

private fun Task_17(){
    var points1 = listOf<Double>(sc.nextDouble(), sc.nextDouble());
    var points2 = listOf<Double>(sc.nextDouble(), sc.nextDouble());

    var l = sqrt((points2[0]-points1[0]).pow(2) + (points2[1] - points1[1]).pow(2));
    println(l);
}

private fun Task_18() {
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var c = b;
    b=a;
    a=c;

    println("a: $a, b: $b");
}

private fun Task_19(){
    var a: Float = sc.nextFloat();
    var b: Float = sc.nextFloat();

    var c = a;
    a = b;
    b = c;

    println(a);
    println(b);
}

private fun Task_20(){
    var x: Float = sc.nextFloat();

    var y = 3 * x.pow(6) - 6* x.pow(2) - 7;

    println(y);
}

private fun Task_21(){
    var x: Float = sc.nextFloat();

    var y = 4*(x-3).pow(6) - 7 * (x-3).pow(3) + 2;

    println(y);
}

private fun Task_22(){
    var a: Float = sc.nextFloat();
    var a1 = a.pow(2);
    var a2 = a.pow(4);
    var a3 = a.pow(8);

    println("a1: $a1; a2: $a2, a3: $a3");
}

private fun Task_23(){
    var alpha = sc.nextDouble();

    var deg = Math.toRadians(alpha);
    println("alpha: $alpha - $deg radians");
}

private fun Task_24(){
    var deg = sc.nextDouble();

    var alpha = Math.toDegrees(deg);
    println("alpha: $alpha - $deg radians");
}

private fun Task_25(){
    var v1: Float = sc.nextFloat();
    var v2: Float = sc.nextFloat();
    var s: Float = sc.nextFloat();
    var t: Float = sc.nextFloat();
    var l = t*(v1+v2);

    println(l+s);
}