public class StringDemo {
    public static void main(String[] args) {

        int i=10;
        String s="s";
        Integer integer=new Integer("100");
        //1.int转换成Integer
       Integer i1= Integer.valueOf(i);
        //2.Integet转换成int
       int i2= integer.intValue();
        //3.String转换成Integer
    Integer i3=     Integer.valueOf(s);
        //4.Integer转换成String
       String i4= integer.toString();
        //5.String转换成int
       int a= Integer.parseInt(s);
        //6.int转换成String
      String s1=  Integer.toString(i);
        /*StringBuffer stringBuffer=new StringBuffer();
        String[] strings={"吃饭","睡觉","学习"};++
       for (int i=0;i<strings.length;i++){
           if (i==strings.length-1){
               stringBuffer.append(strings[i]);
           }else{
               stringBuffer.append(strings[i]);
               stringBuffer.append(",");
           }

       }
        System.out.print(stringBuffer);*/
    }
}
