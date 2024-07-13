// example of super keyword
class M{
 M(){
    System.out.println("Default M");
 }
 M(int q){
    System .out.println(" parameter 1M");
 }
}
class Supr extends M{
 Supr(){
    System.out.println("Default Supr");
 }
 Supr(int q){
    super(78);//jaise he super keyword ka use kiye to parent ka parameter constructor call ho gya
    System .out.println(" parameter 1Supr");
 }
 public static void main(String[] args){
    Supr x = new Supr();//call both default constructor
        Supr y = new Supr(35);//call default of parent and child of one parameter isme jo 35 he wo child ka he or jo 78 he wo parent ka hoga
 }
}