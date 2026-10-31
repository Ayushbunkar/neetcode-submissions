class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans = new ArrayList<>();

        solve(n,0,0,ans,"");
        return ans ;
    }

    public void solve (int n,int open, int close , List<String> ans , String current){
       
       //base case 
       if(open ==n && close==n){
        ans.add(current);
        return;
       }
       //opening bracket 
       if(open<n){
       solve(n,open+1,close,ans,current + "(");
       }
       //closing bracket
       if(close<open){
        solve(n,open,close+1,ans,current + ")");

       }
    }
}
