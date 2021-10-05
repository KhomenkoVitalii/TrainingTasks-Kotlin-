import kotlin.math.pow

fun main() {

}

private fun Task_1(){
    var n = sc.nextInt();
    if(n>0){
        n += 1;
    }
    else{
        println(n);
    }
}

private fun Task_2(){
    var n = sc.nextInt();
    if(n>0){
        n += 1;
        println(n);
    }
    else{
        n -= 2;
        println(n);
    }
}

private fun Task_3(){
    var n = sc.nextInt();
    if(n>0){
        n += 1;
        println(n);
    }
    if (n<0){
        n -= 2;
        println(n);
    }
    if (n==0){
        n=10;
        println(n);
    }
}

private fun Task_4(){
    var a = sc.nextFloat();
    var b = sc.nextFloat();
    if(a>b){
        println(a);
    }
    else{
        println(b);
    }
}

private fun Task_5(){
    var a = sc.nextFloat();
    var b = sc.nextFloat();
    if(a>b){
        println("$a, $b");
    }
    else{
        println("$b, $a");
    }
}

private fun Task_6(){
    var a = sc.nextFloat();
    var b = sc.nextFloat();

    if(a != b){
        val c = a + b;
        a = c;
        b = c;
        println("$a, $b");
    }
    else if (a==b){
        println("$a, $b");
    }
}

private fun Task_7(){
    var a = sc.nextFloat();
    var b = sc.nextFloat();
    var c = sc.nextFloat();

    if(a < b && a<c){
        println("$a");
    }
    else{
        if(b<c){
            println(b);
        }
        else {
            println(c);
        }
    }
}

private fun Task_8() {
    var a = sc.nextFloat();
    var b = sc.nextFloat();
    var c = sc.nextFloat();

    if (a > c && a > b) {
        if (c > b) {
            println(c)
        } else {
            println(b)
        }
    }

    if (b > a && b > c) {
        if (a > c) {
            println(a);
        } else {
            println(c);
        }
    }

    if (c > a && c > b) {

        if (a > b) {
            println(a);
        } else {
            println(b);
        }
    }
}

private fun Task_9() {
    var a = sc.nextFloat();
    var b = sc.nextFloat();
    var c = sc.nextFloat();

    if (a < b && a < b) {
        println(b+c);
    }
    else{
        println(a+b);
    }
}

private fun Task_10(){
    var x = sc.nextInt();
    var f: Int;
    if (x<-2 || x>2)
    {
        f = 2*x;
    }
    else{
        f = -3 * x;
    }
    println(f);
}

private fun Task_11(){
    var x = sc.nextFloat();
    var f: Float = 0F;
    if (x<=0)
    {
        f = -x;
    }
    if(x>0 && x<2){
        f = x.pow(2);
    }
    if(x>=2){
        f = 4F;
    }
    println(f);
}

private fun Task_12(){
    var year = sc.nextInt();
    if(year%4 == 0){
        if(year%100 == 0){
            if(year%400 != 0){
               println(365);
            }
            else{
                println(366);
            }
        }
        else{
            println(366);
        }
    }
    else{
        println(365);
    }
}