class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        StringBuilder sb=new StringBuilder();

        String[] newPath=path.split("/");
        for(int i=0;i<newPath.length;i++){
            if(!s.isEmpty() && newPath[i].equals("..")){
                s.pop();
            }
            else if(!newPath[i].equals("") && !newPath[i].equals(".") && !newPath[i].equals("..")){
                s.push(newPath[i]);
            }
        }

        if(s.isEmpty())
        return "/";

        while(!s.isEmpty()){
           sb.insert(0,s.pop()).insert(0,"/");
        }

        return sb.toString();


    }
}