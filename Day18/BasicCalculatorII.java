class BasicCalculatorII {
    public int calculate(String s) {
        if(s.length()==0 ||s==null){
            return 0;
        }

        Stack<Integer> stack=new Stack<>();
        char op='+';     
        int res=0;
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                res=res*10+ch[i]-'0';          
                
                 }

                 if(!Character.isDigit(ch[i]) && ch[i]!=' ' || i==ch.length-1){

                    if(op=='+'){
                        stack.push(res);
                    }
                    else if(op=='-'){
                        stack.push(-res);
                    }

                    else if(op=='*'){
                        stack.push(stack.pop()*res);
                    }

                    else if(op=='/'){
                        stack.push(stack.pop()/res);
                    }
                    op=ch[i];
                    res=0;
                    
                 }
        }

        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }

         return sum;
        
    }
}