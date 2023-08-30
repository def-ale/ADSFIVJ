using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BubbleSort2
{
    public class BubbleSort
    {
        public static void Ordena(Time[] times)
        {
            for (int i = 0; i < times.Length - 1; i++)
            {
                for (int j = 0; j < times.Length - i - 1; j++)
                {
                    if (times[j].Position > times[j+1].Position)
                    {
                        Troca(times, j);
                    }
                }
            }
        }

        public static void Troca(Time[] times, int j)
        {
            var aux = times[j+1];
            times[j+1] = times[j];
            times[j] = aux;
        }
    }
}