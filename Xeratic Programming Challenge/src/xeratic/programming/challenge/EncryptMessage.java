package xeratic.programming.challenge;
public class EncryptMessage {

    public static String cipher(String message, String key) {
        // Asumsi Jika Uppercase sama dengan lowercase
        key = key.toLowerCase();
        message = message.toLowerCase();
        
        // Deklarasi variabel hasil 
        String result = "";
        char[] keyArray = key.toCharArray();
        char temp;
        
        // Membuat kode berdasarkan key
        // 1. Sort terlebih dahulu keynya
        for(int i=0; i < keyArray.length; i++){  
            for(int j=1; j < (keyArray.length-i); j++){  
                if(keyArray[j-1] > keyArray[j]){  
                    temp = keyArray[j-1];  
                    keyArray[j-1] = keyArray[j];  
                    keyArray[j] = temp;  
                }  
            }  
        }
        //2. menentukan kode
        int[] keyCode = new int[key.length()];
        for (int i = 0; i < key.length(); i ++){
            int k = 0;
            for (int j = 0; j < keyArray.length; j++){
                if (key.charAt(i) != keyArray[j]){
                    k++;
                }else{
                    break;
                }
            }
            keyCode[i] = k;
        }    
    //    for (int i = 0; i < keyCode.length; i++){
    //        System.out.println(keyCode[i]);
    //    }

        // Menyesuaikan code dengan Massage
        int rows ;
        if (message.length()%keyCode.length == 0){
            rows = message.length()/keyCode.length;
        }else{
            rows = (message.length()/keyCode.length)+1;
        }

        int[][] messageCode = new int[rows][keyCode.length];
        char[][] messgaeArray = new char[rows][keyCode.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(true){
            if (j > keyCode.length-1){
                i++;
                j=0;
            }
            if (i > rows){
                break;
            }
            if (k == rows*keyCode.length){
                break;
            }
            try {
                messageCode[i][j]  = keyCode[j];
                messgaeArray[i][j] = message.toCharArray()[k];
            } catch (Exception e) {
                messgaeArray[i][j] = ' ';
            }
            j++;
            k++;            
        }
        int temp2;
        
        // Mengurutkan message sesuai code
        for(i=0; i < rows; i++){
            for(j=0; j < keyCode.length; j++){
                for(k=1; k < (keyArray.length-j); k++){  
                    if(messageCode[i][k-1] > messageCode[i][k]){  
                        temp2 = messageCode[i][k-1];  
                        temp = messgaeArray[i][k-1];
                        messageCode[i][k-1] = messageCode[i][k];
                        messgaeArray[i][k-1] = messgaeArray[i][k];
                        messageCode[i][k] = temp2; 
                        messgaeArray[i][k] = temp;
                    }  
                } 
            }
        }        
        
        // karena proses dari tadi menggunakan array, ubah kembali menjadi String
        for(i=0; i < rows; i++){
            for(j=0; j < keyCode.length; j++){
                result += messgaeArray[i][j];
            }
        }  
        
        return result;
      }
}


