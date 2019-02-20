package Code;

public class Replace {

    public String str(String original, String source, String target) {
        if(source==null || target==null || source.length()<1 || target.length()<1)
            return original;
        StringBuilder buff=new StringBuilder();
        int start=0;
        int i;
        for (i = 0; i < original.length(); i++) {
            if(check(i, original, source)){
                for(int l=start;l<i;l++){
                    buff.append(original.charAt(l));
                }
                buff.append(target);
                start=i+source.length();
                i=start-1;
            }
        }
        if(i>start){
            for(int l=start;l<original.length();l++){
                buff.append(original.charAt(l));
            }
        }
        return buff.toString();
    }

        public boolean check(int index,String original, String source) {
            int count = 0;
            while (count < source.length())
                if (original.charAt(index) == source.charAt(count)) {
                    index++;
                    count++;
                } else
                    return false;
            return true;
        }

    public static void main(String[] args) {
        Replace r=new Replace();
        System.out.println(r.str("aboaboo","ab","o"));
    }


}
