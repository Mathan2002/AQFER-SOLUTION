class Main {
    public static void main(String[] args) throws Exception {
        String a = "abadcadhtcabcadodfea";
        boolean flag = false;
        String check = "ca";
        for(int i = 0; i<a.length()-2; i++) {
            if(a.substring(i,i+2).equals("ca")) {
                if(flag) {
                    a = a.substring(0, i)+"bd"+a.substring(i+2);
                    break;
                } else {
                    flag = true;

                }            }
        }
        System.out.println(a);
    }
}
