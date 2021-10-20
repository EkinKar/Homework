public class GenericStackOps <T extends Comparable<T>>{


    public void isBalanced(String val){
        GenericStack<String> temp = new GenericStack<>((Class<String>)val.getClass(), val.length());
            String[] arr = val.split("");
            for(String character : arr) {
                if (character.equals("(")){
                    temp.push(character);
                    continue;
                }
                if (character.equals("[")){
                    temp.push(character);
                    continue;
                }
                if (character.equals(")")){
                    if (!temp.pop().equals("(")){
                        System.out.println("Not balanced.");
                        return;
                    }
                }
                if (character.equals("]")){
                    if (!temp.pop().equals("[")){
                        System.out.println("Not balanced.");
                        return;
                    }
                }
            }
            if (temp.isEmpty()){
                System.out.println("Balanced.");
            }
            else System.out.println("Not Balanced.");
    }


    public void calculate(String val){
        GenericStack<String> temp = new GenericStack<>((Class<String>)val.getClass(), val.length());
        String[] arr = val.split(",");
        for(String character : arr) {
            if (!character.equals("+") && !character.equals("-") && !character.equals("*") && !character.equals("/")){
                temp.push(character);
            }
            else if (character.equals("+")){
                int a = Integer.parseInt(temp.pop());
                int b = Integer.parseInt(temp.pop());
                String c = String.valueOf(b+a);
                temp.push(c);

            }
            else if (character.equals("-")){
                int a = Integer.parseInt(temp.pop());
                int b = Integer.parseInt(temp.pop());
                String c = String.valueOf(b-a);
                temp.push(c);

            }
            else if (character.equals("/")){
                int a = Integer.parseInt(temp.pop());
                int b = Integer.parseInt(temp.pop());
                String c = String.valueOf(b/a);
                temp.push(c);
            }
            else{
                int a = Integer.parseInt(temp.pop());
                int b = Integer.parseInt(temp.pop());
                String c = String.valueOf(b*a);
                temp.push(c);
            }
        }
        temp.display();
    }
}
