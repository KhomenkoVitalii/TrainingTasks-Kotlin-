fun main(){

}

private fun Task_1() {
    val k= sc.nextInt();
    var n= sc.nextInt();

    while (n > 0){
        println(k)
        n -= 1;
    }
}

private fun Task_2(){
    var n= sc.nextFloat();

    for(i in 1..10){
        println(i*n);
    }
}

private fun Task_3(){
    val a= sc.nextInt();
    var b= sc.nextInt();
    var sum = 0;
    for(i in b until a){
        sum += 1;
        println(sum);
    }
}

private fun Task_4(){
    val a= sc.nextFloat();
    var n= sc.nextInt();
    var p: Float = 1f;

    for (i in 1..n+1){
        p *= a;
        println(p);
    }
}

private fun Task_5(){
    var n= sc.nextInt();
    var result: Int = 1;
    for(i in  1..n){
        result *= i;
    }
}

private fun Task_6(){
    var n= sc.nextInt();

    var x = mutableListOf(1, 2, 3)
    var k = 4;

    println(x);

    for (i in 4..n+1){
        var ak = x[k-1] + x[k-2] - 2 * x[k-3];
        x.add(ak);
        println(ak);
    }
}

private fun Task_7(){
    var n = sc.nextFloat();
    var k = sc.nextFloat();
    var dil = 0;
    while (n-k >= 0){
        n -= k;
        dil += 1;
    }
    println(dil);
    println(n)
}

private fun Task_8(){
    var n = sc.nextFloat();
    var i = 0;
    var s = 1;
    while(s<n){
        i+=1;
        s+=1;
    }
}

private fun Task_9(){
    var p = sc.nextFloat();
    var k = 0;
    var sum = 1000F;
    while (sum <= 1100){
        sum *= (p / 100 + 1);
        k += 1;
    }
    println("$k - $sum");
}

private fun Task_10(){
    var n = sc.nextInt();
    while (n > 0){
        println(n%10);
        n /= 10;
    }
}

private fun Task_11(){
    var a = sc.nextInt();
    var b = sc.nextInt();

    while (a>=0){
        if (a >= b){
            a %= b;
        }
        else{
            b %= a;
        }
        println(a+b);
    }
}

private fun Task_12(){
    var n = sc.nextInt();
    var f1=1;
    var f2=1;
    var f=0;

    while (n > f2){
        f=f2;
        f2 += f1;
        f1 = f;
    }
    if (n == f2){
        println(true)
    }
    else{
        println(false)
    }
}