using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BubbleSort
{
    public class BubbleSorting
    {
        public static void Ordenar(Product[] products)
        {
            for ( int i = 0; i < products.Length - 1; i++ )
            {
                for ( int j = 0; j < products.Length - 1 - i; j++)
                {
                    if ( products[j].Price > products[j+1].Price )
                    {
                        Trocar(products, j);
                    }
                }
            }
        }

        private static void Trocar(Product[] products, int j)
        {
            var aux = products[j];
            products[j] = products[j+1];
            products[j+1] = aux;
        }
    }
}