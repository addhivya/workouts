package Code;

import java.util.TreeSet;

public class Uniqueemail {

    public int numUniqueEmails(String[] emails) {
        TreeSet<String> set=new TreeSet<>();
        for(int i=0;i<emails.length;i++)
        {
            String e=emails[i];
          {
                int index=e.indexOf('+');
                int last=e.indexOf('@');
                String res=e.substring(0,index);
                String end=e.substring(last,e.length());
                res= res.replace(".","");
                set.add(res+end);
            }
        }
 return set.size();
    }

    public static void main(String[] args) {
        Uniqueemail email=new Uniqueemail();
        String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(email.numUniqueEmails(emails));

    }


}
