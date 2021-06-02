package xeratic.programming.challenge;

// Function Untuk Menghasilkan bilangan fibonacci 
public class CrossFibonacci {
  public static int realFibonacci(int length){
      int f0 = 0;
      int f1 = 1;
      
      if (length == 0){
          return f0;
      }else if (length == 1){
          return f1;
      }else {
          return realFibonacci(length-1) + realFibonacci(length-2);
      }
  }
  
  public static String deretCrossfibonacci(int length){
      // Inisialisasi variabel deret fibonacci
      String fib = "";
      String fibGenap = ""; // Variabel Deret fibonaci dengan urutan Genap
      String fibGanjil = ""; // Variabel Deret fibonaci dengan urutan Ganjil
      
      // Membuat Deret Fibonaci langsun g dipisah bersarkan urutan ganjil genap
      for (int i = 1; i <= length; i++){
          if (i % 2 == 0){
              fibGenap += realFibonacci(i);
              if (i != length){             
                  fibGenap += ",";
              }
          }else{
              fibGanjil += (realFibonacci(i));
              if (i != length){             
                  fibGanjil += ",";
              }
          }         
      }

      
      // Reverse Deret fibonacci dengan urutan genap yang dimasukan ke variabel fibonacci 
      String array1[]= fibGanjil.split(",");    
      for (int i = array1.length-1; i >= 0; i--){
          fib += array1[i];
          if (i != length){             
              fib += ",";
          }
      }
      
      // return variabel fibonacci + 0 + fibnaci derep genap
      return fib+"0,"+fibGenap;
  }
}
