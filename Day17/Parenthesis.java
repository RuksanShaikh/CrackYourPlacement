class Parenthesis {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans=new ArrayList<>();
        pare("",0,0,n,ans);
        return ans;

    }
    public static void pare(String curr,int open,int close,int total,List<String>ans){

        if(curr.length()==2*total){
            ans.add(curr);
            return;
        }

        if(open<total){
            pare(curr+"(",open+1,close,total,ans);
        }

        if(close<open){
            pare(curr+")",open,close+1,total,ans);
        }
    }
}