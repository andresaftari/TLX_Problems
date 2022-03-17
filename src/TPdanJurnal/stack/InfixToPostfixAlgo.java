package TPdanJurnal.stack;

public class InfixToPostfixAlgo {
    public String infixToPostfixConversion(String exp) {
        int i;
        Stack s = new Stack();
        char temp;
        String output = "";

        for (i = 0; i < exp.length(); i++) {
            temp = exp.charAt(i);

            if (Character.isLetterOrDigit(temp))
                output += temp;
            else if (temp == '(')
                s.push(temp);
            else if (temp == ')') {
                while (!s.isEmpty() && s.stackTop() != '(') {
                    output += s.pop();
                }
                if (s.isEmpty())
                    return "expression not valid";
                else
                    s.pop();
            } else {
                while (!s.isEmpty() && (precedence(temp) <= precedence(s.stackTop()))) {
                    output += s.pop();
                }
                s.push(temp);
            }
        }
        while (!s.isEmpty())
            output += s.pop();
        return output;
    }

    public int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static void main(String[] args) {
        String exp = "(1+2)/(3*5^2)";

        InfixToPostfixAlgo i = new InfixToPostfixAlgo();
        String output = i.infixToPostfixConversion(exp);
        System.out.println(output);
    }
}