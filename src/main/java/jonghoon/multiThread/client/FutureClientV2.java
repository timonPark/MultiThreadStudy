package jonghoon.multiThread.client;

import jonghoon.multiThread.future.data.Data;
import jonghoon.multiThread.future.host.Host;
import jonghoon.multiThread.future.host.HostV2;

public class FutureClientV2 {
    public static void main(String[] args) {
        System.out.println("main BEGIN");
        HostV2 host = new HostV2();
        Data data1 = host.request(10, 'A');
        Data data2 = host.request(20, 'B');
        Data data3 = host.request(30, 'C');

        System.out.println("main otherJob BEGIN");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){

        }
        System.out.println("main otherJob END");
        System.out.println("data1 = " + data1.getContent());
        System.out.println("data2 = " + data2.getContent());
        System.out.println("data3 = " + data3.getContent());
        System.out.println("main END");
    }
}
