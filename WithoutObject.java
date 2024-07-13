// without create object how to access private static variable
class Program{
    private static int x;
    // agr private statuc ko access krna he to functionko static bnakr kro uske class ko main me function  ko call krna pdega
   static void f1(){
        x=8;
    }
}
class WithoutObject{
        public static void main(String[] args){
        Program.f1();
    }

}