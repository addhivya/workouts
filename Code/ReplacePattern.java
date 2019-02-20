package Code;

public class ReplacePattern {
  public String pattern(String original,String source, String target){
      if(source.length()<1 || target.length()<1 || source==null || target==null || original.length()<1)
          return original;
      int[] arr=new int[source.length()];
      int begin=0;
      StringBuilder builder=new StringBuilder();
      arr=patternmatch(arr,source);
      for(int i=0;i<original.length();i++){
          int end=findmatching(original,i,source,arr);
          //System.out.println(end);
          if(end<0) {
              builder.append(original.substring(i, original.length()));
              break;
          }
          else {
              begin = end - source.length();
              builder.append(original.substring(i, begin));
              builder.append(target);
              i=end-1;
          }
      }
      return  builder.toString();
  }


  public int[] patternmatch(int[] arr,String source){
      arr[0]=0;
      int m=1;
      int start=0;
      int end=1;
      while(m<source.length()){
          if(source.charAt(start)==source.charAt(end)) {
              arr[m] = arr[start]+1;
              start++;
              end++;
              m++;
          } else {
              if(start==0) {
                  arr[m] = 0;
                  end++;
                  m++;
              }
              else start=arr[start-1];
          }
      }
      return arr;
  }

  public int findmatching(String original, int start,String source,int[] arr){
      int j=0;
      int s=start;
      System.out.println(start);
      while(j<source.length() && start<original.length()){
          if(original.charAt(start)==source.charAt(j)) {
              j++;
              start++;
          }
          else if(j>0)
          {
              j=arr[j-1];
          }
          else if(j==0){
              start++;
          }
      }
      if( s==start || j<source.length())
          return -1;
      return start;
  }

    public static void main(String[] args) {
        ReplacePattern pat=new ReplacePattern();
        System.out.println(pat.pattern("aaaaaabbbbbbb","aabb","o"));
    }
}
