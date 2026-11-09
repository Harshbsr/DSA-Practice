package intervals;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/*
Q. Given a list of intervals, merge all the overlapping intervals and return a list of non-overlapping intervals.

Example –

Input: intervals = [{2, 6}, {1, 3}, {8, 10}]

Output: [{1, 6}, {8, 10}]
 */
public class MergeIntervals {

    class Interval{
        int start;
        int end;

        public Interval(int start, int end){
            this.start=start;
            this.end=end;
        }
    }

    public List<Interval> merge(List<Interval> intervals){
        if(intervals.size()<2){
            return intervals;
        }
        intervals.sort((a,b)->Integer.compare(a.start,b.start));
        List<Interval> result = new ArrayList<>();
        Interval current = intervals.get(0);
        for(int i=1;i<intervals.size();i++){
            Interval next = intervals.get(i);
            if(next.start<=current.end){
                current.end = Math.max(current.end,next.end);
            }else{
                result.add(current);
                current= next;

            }

        }
        result.add(current);

        return result;
    }

    public static void main(String[] args){
        MergeIntervals mi = new MergeIntervals();
        List<Interval> intervals = new ArrayList<>();
        intervals.add(mi.new Interval(2,6));
        intervals.add(mi.new Interval(1,3));
        intervals.add(mi.new Interval(8,10));
        List<Interval> result = mi.merge(intervals);

        for(Interval i:result){
            System.out.print("{"+ i.start+","+i.end+"} ");
        }
    }
}
