class Solution{
  
     //Time Complexity: O(n)
    //Space Complexity: O(1)
    
    private static int shortestWordDistanceIII(String[] words, String word1, String word2){
        
        //Approach 1
//         int i1 = -1;
//         int i2 = -1;
        
//         int min = Integer.MAX_VALUE;
        
//         if(word1.equals(word2)){
            
//             for(int i=0; i<words.length; i++){
                
//                 String word = words[i];
//                 if(word.equals(word1)){
                    
//                     if(i1 < i2){
//                         i1 = i;
//                     }
//                     else{
//                         i2 = i;
//                     }
//                 }
//                 if(i1 != -1 && i2 != -1){
//                     min = Math.min(min, Math.abs(i1-i2));
//                 }
//             }
//         }
//         else{
            
//             for(int i=0; i<words.length; i++){
                
//                 String word = words[i];
//                 if(word.equals(word1)){
//                     i1 = i;
//                 }
//                 if(word.equals(word2)){
//                     i2 = i;
//                 }
                
//                 if(i1 != -1 && i2 != -1){
//                     min = Math.min(min, Math.abs(i1-i2));
//                 }
//             }
//         }
//         return min;
        
        
        //Approach 2
        
        int i1 = -1;
        int i2 = -1;
        
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i< words.length; i++){
            
            String word = words[i];
            
            if(word.equals(word1)){
                i1 = i;
            }
            if(word.equals(word2)){
                
                if(i1 == i){
                    i1 = i2;
                }
                i2 = i;
            }
            
            if(i1 != -1 && i2 != -1){
                min = Math.min(min, Math.abs(i1-i2));
            }
        }
        return min;
    }
}