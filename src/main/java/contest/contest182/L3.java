package contest.contest182;

import org.junit.Test;

import java.util.HashMap;

public class L3 {
    HashMap<String,Station> zhanzhan = new HashMap<>();
    HashMap<Integer,Info> id2info = new HashMap<>();
    public static class Info{
        String station;
        int time;
    }
    public static class Station{
        HashMap<String,Integer[]> map = new HashMap<>();//0 次数，1时间

    }
    public L3() {

    }

    public void checkIn(int id, String stationName, int t) {
        Info info = new Info();
        info.station=stationName;
        info.time=t;
        id2info.put(id,info);

    }

    public void checkOut(int id, String stationName, int t) {
        Info info = id2info.get(id);
        String begin = info.station;
        int time = t-info.time;
        if (zhanzhan.get(stationName)==null){
            zhanzhan.put(stationName,new Station());
        }
        if(zhanzhan.get(begin)==null){
            zhanzhan.put(begin,new Station());
        }
        Station end = zhanzhan.get(stationName);
        Station beginn = zhanzhan.get(begin);
        Integer [] endxinxi = end.map.get(begin);
        if (endxinxi==null){
            endxinxi=new Integer[2];
            endxinxi[0]=0;
            endxinxi[1]=0;
        }
        endxinxi[0]=endxinxi[0]+1;
        endxinxi[1]=endxinxi[1]+time;
        end.map.put(begin,endxinxi);
        beginn.map.put(stationName,endxinxi);
    }

    public double getAverageTime(String startStation, String endStation) {
        Integer[] integers = zhanzhan.get(startStation).map.get(endStation);
        return (double)integers[1]/integers[0];
    }

    @Test
    public void test(){
        L3 l = new L3();
        l.checkIn(45,"Leyton",3);
        l.checkIn(32,"Paradise",8);
        l.checkIn(27,"Leyton",10);
        l.checkOut(45,"Waterloo",15);
        l.checkOut(27,"Waterloo",20);
        l.checkOut(32,"Cambridge",22);
        System.out.println(l.getAverageTime("Paradise", "Cambridge"));
        System.out.println(l.getAverageTime("Leyton","Waterloo"));
        l.checkIn(10,"Leyton",24);
        l.checkOut(10,"Waterloo",38);
        System.out.println(l.getAverageTime("Leyton","Waterloo"));

    }
}
