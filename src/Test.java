public class Test {
    public static void main(String[] args) {

        GenericStackOps<String> sops = new GenericStackOps<>();
        sops.isBalanced("(([]))");
        sops.isBalanced("[()]()");
        sops.isBalanced("[[]](()");
        sops.isBalanced("()[())]");

        GenericStackOps<String> ops = new GenericStackOps<>();
        ops.calculate("2,3,5,*,-,3,+");
    }
}
