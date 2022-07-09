import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Third {
    public static void main(String[] args) {
        //Работа со строкой как с массивом символов
        System.out.println("Работа со строкой как с массивом символов");
        //3.1.1
        String[] camelCase={"Camel", "snake"};
        String[] snakeCase = toBuildSnakeCasa(camelCase);
        System.out.println(Arrays.toString(camelCase));
        System.out.println(Arrays.toString(snakeCase));

       // System.out.println('\n');
        //3.1.5
        String st="vufquyf gwuvhwev be fq f w ";
        String str = st.trim(); //Удаляет пробелы в начале и в конце
        String[] s= new String[str.length()];
        int l=s.length;
        String[] s1= new String[l];
        for(int i=0; i<str.length(); i++){
            s[i] = String.valueOf(str.charAt(i));
        }
        String ss;
        int j=0;
        for (int i=0; i<s.length; i++){
             if(s[i] == " "){
                 continue;
            }else {
                 s1[j]=s[i];
                 j++;
             }
        }
        System.out.println(Arrays.toString(s1));
        System.out.println(maxWord(st));
        System.out.println('\n');


        //Работа со строкой как с объектом типа String and StringBuilder
        System.out.println("Работа со строкой как с объектом типа String and StringBuilder");
        //3.2.1
        String q="erfhwu erw  w   erfw";
        int kol =0, k=0;
        for(int i=0; i<q.length(); i++){
            if (q.charAt(i) == ' ' && q.charAt(i-1) == ' '){
                kol++;
                k=kol;
            }
            else kol=0;
        }
        System.out.println(k);
        //System.out.println('\n');


         //3.2.3
        String pal= "asdsa";
        boolean pa=false;
        for (int i=0; i < pal.length(); i++){
            if(pal.charAt(i) == pal.charAt(pal.length()-i-1)){
                pa = true;
                continue;
            } else {
                pa = false;
                //System.out.println("ne palindrom");
            }
        }
        String result = pa? " - palindrom" : " - ne palindrom";
        System.out.println(pal + result);
       // System.out.println('\n');


        //3.2.4
        String n4= "информатика";
        System.out.println(MakeTort(n4));

        //3.2.8
        String n8="uwefwff e w fwe fw efwefwfw  fwqwgqwgq gg gsgg";
        System.out.println(maxWord1(n8));

        //3.2.10
        String n10 = "f7wtgfg! gerwrgb. eguwe fhwuef? rywegryw.";
        System.out.println(kolvaStrok(n10));

        System.out.println('\n');


        //Работа с регулярными выражениями (Pattern, Matcher)
        System.out.println("Работа с регулярными выражениями (Pattern, Matcher)\n");
        //3.3.2
        String xml = "<notes>\n" +
                "    <note id = \"1\">\n" +
                "        <to>Вася</to>\n" +
                "        <from>Света</from>\n" +
                "        <heading>Напоминание</heading>\n" +
                "        <body>Позвони мне завтра!</body>\n" +
                "    </note>\n" +
                "    <note id = \"2\">\n" +
                "        <to>Петя</to>\n" +
                "        <from>Маша</from>\n" +
                "        <heading>Важное напоминание</heading>\n" +
                "        <body/>\n" +
                "    </note>\n" +
                " </notes> \n";

        String xmlAnalysis = xmlAnalyzer(xml);
        System.out.println(xmlAnalysis);

    }

    private static String xmlAnalyzer(String str) {
        StringBuilder strBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String [] lines = str.split("\n\\s*"); /* разбиваем xml построчно */

        /* проверяем содержимое каждой строки */
        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - тег без тела\n");
            }
            else if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - открывающий тег\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group().substring(1));
                strBuilder.append("\b - содержимое тега\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - закрывающий тег\n");
            }

        }
        return strBuilder.toString();
    }

    private static int kolvaStrok(String str) {
        int kol=0;
        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) ==  '!' || str.charAt(i) ==  '?' || str.charAt(i) ==  '.'){
                kol++;
            }
        }
        return kol;
    }

    private static String maxWord1(String str) {
        int kol=0;
        int[] mas= new int[str.length()];
        String s = "";
        for (int i=0; i< str.length(); i++){
            if(str.charAt(i) != ' '){
                s+=String.valueOf(str.charAt(i));
                kol++;
                mas[i]=kol;
            } else {
                kol=0;
                s="";
            }
        }
        int max= Integer.MIN_VALUE;
        int il=0, il1, if1=0;
        for(int i=0; i< mas.length; i++){
            max=Math.max(max,mas[i]);
        }
        for(int i=0; i< mas.length; i++){
            if(mas[i] == max){
                il=i;
            }
        }
        il1=il;
        while (mas[il1]!=0){
            if1=il1;
            il1--;
        }
        for (int i=if1; i<=il;i++){
            s+=String.valueOf(str.charAt(i));
        }

        return s;
    }

    private static String maxWord(String str) {
        StringBuilder build = new StringBuilder(str.trim());
        int kol=0;
        String s = "";
        for (int i=0; i< build.length(); i++){
            if(str.charAt(i) != ' '){
                s+=String.valueOf(str.charAt(i));
                kol++;
            } else kol=0;
        }
        return s;
    }

    private static String MakeTort(String str) {
        String Cake=String.valueOf(str.charAt(str.indexOf("т")));
        Cake+=String.valueOf(str.charAt(str.indexOf("о")));
        Cake+=String.valueOf(str.charAt(str.indexOf("р")));
        Cake+=String.valueOf(str.charAt(str.indexOf("т")));
        return Cake;
    }

    private static String[] toBuildSnakeCasa(String[] camelCase) {
        String[] snakeCase = new String[camelCase.length];
        for (int i=0; i< camelCase.length; i++){
            snakeCase[i]=camelCase[i];
        }

        return snakeCase;
    }
}
