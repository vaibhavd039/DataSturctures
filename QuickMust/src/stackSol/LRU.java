package stackSol;

import java.util.*;

public class LRU {
}
class LRUChache
        {
            Deque<Integer> dq;
            Set<Integer> map;
            int size;
            LRUChache(int size)
            {
                dq= new LinkedList<Integer>();
                map= new HashSet<Integer>();
                this.size=size;
            }
            public void refer(int x)
            {
                if(!map.contains(x))
                {
                    if(dq.size()==size)
                    {
                        int last= dq.removeLast();
                        map.remove(last);

                    }
                }

                else
                {
                    int index=0, i=0;
                    Iterator<Integer> itr=dq.iterator();
                    while(itr.hasNext())
                    {
                        if(itr.next()==x)
                        { index=i;
                        break;
                        }
                        i++;
                    }
                    dq.remove(index);

                }
                dq.push(x);
                map.add(x);

            }
            public void display()
            {
                Iterator<Integer> itr = dq.iterator();
                while (itr.hasNext()) {
                    System.out.print(itr.next() + " ");
                }
            }




        }

