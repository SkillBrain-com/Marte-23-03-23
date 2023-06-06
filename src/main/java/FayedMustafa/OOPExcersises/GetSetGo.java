package FayedMustafa.OOPExcersises;

public interface GetSetGo {

    int count = 1;
}


class TestMyGetSetGo{
    public static void main(String[] args) {

        GetSetGo[] arr = new GetSetGo[5];
        for(GetSetGo gsg : arr){
//            gsg.count++;
        }
        System.out.println(GetSetGo.count);
    }
}