static boolean isStringRotation(String s1, String s2){
        if(s1 == null || s2 == null || s1.length() != s2.length())
            return false;
        
        s1 = s1 + s1;
        
        return isSubstring(s1, s2);
    }
