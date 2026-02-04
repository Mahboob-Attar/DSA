public class Strings {
    public static void main(String[] args){
       String Name = "   Bablu Attarattar";
        int Value = Name.length();
        System.out.println(Value);

        //create string with string class also
        /*String Name = new String("Bablu Attar");
        String v = Name.replace("B","T");
        System.out.println(v);
        StringBuilder str = new StringBuilder("Mahboob Attar");
        System.out.println(str); //immutable they cam store to create another variable
                str.insert(3,"e");
        System.out.println(str);*/


        //lower case and lower case
        String upcase = Name.toUpperCase();
        System.out.println(upcase);
        String lcase = Name.toLowerCase();
        System.out.println(lcase);

        //trim remove front and backspaces
        String trimmed = Name.trim();
        System.out.println(trimmed);

        // subtstring return new value where index start from 4
        System.out.println(Name.substring(3));
        //substring start and end index end index excluded if we give 8 it return till 7th index ,
        System.out.println(Name.substring(3,8));

        //replaces values
        System.out.println(Name.replace("Attar" ,"Bablu"));
        System.out.println(Name.replace("B" ,"A"));
        System.out.println(Name.replace("Attar" ,"A"));
        System.out.println(Name.replace("a" ,"Attar"));

        // string return boolean also
        System.out.println(Name.startsWith("B"));
        System.out.println(Name.startsWith(" "));
        System.out.println(Name.endsWith("r"));
        System.out.println(Name.endsWith("R"));
        System.out.println(Name.endsWith("ar"));

        //return the (indexof ) starting index valuesn if values not match return -1
        System.out.println(Name.indexOf("Ba"));
        System.out.println(Name.indexOf("B"));
        System.out.println(Name.indexOf("B"));
        System.out.println(Name.indexOf("BAA"));

        //itstarts to find from the index 4th
        System.out.println(Name.indexOf("B",4));
        System.out.println(Name.indexOf("A",4));
        System.out.println(Name.indexOf(4));

        //lastindex count from the last index values
        System.out.println(Name.lastIndexOf("ar"));
        System.out.println(Name.lastIndexOf("attar",15));

        //equal too it retrun the values are equal or not
        System.out.println(Name.equals("Bablu Attar"));
        System.out.println(Name.equals("   Bablu Attarattar"));
        System.out.println(Name.equals("   bablu attarattar"));
        System.out.println(Name.equalsIgnoreCase("   bablu attarattar"));//ignorenthe alphabet or case sensitive words
        String str = "Mahboob";  //strings are immutable
        System.out.println(str);

        String str1 = str.replace("M","m");
        System.out.println(str1);
        System.out.println(str.length());
        System.out.println(str.charAt(2));

        //variables are mutable
        int a=10;     //if we want to declare a finale variable 
        System.out.println(a);

        final int b=15; //b we cant declare anymore literals to this variable in this program
        System.out.println(b);


    }
}
