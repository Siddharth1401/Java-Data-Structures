public class remDub {
    public static void removeDub(String str, int idx, StringBuilder newStr, boolean map[]){
        //base case - all chars scanned
        if(idx == str.length()){
            System.out.println(newStr); //print ans
            return;
        }

        //kaam - check char in map
        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){ //index of map
            //duplicate
            removeDub(str, idx+1, newStr, map);
        } else{
            //new char
            map[currChar -'a'] = true; //marked true
            removeDub(str, idx+1, newStr.append(currChar), map); //add to newstring
        }
    
    } 
    public static void main(String args[]) {
        String str = "siddharthsaxena"; 
        //sidhart xen
        removeDub(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
