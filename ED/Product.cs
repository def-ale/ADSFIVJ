using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Linq;
using System.Threading.Tasks;

namespace BubbleSort
{
    public class Product
    {
        private string _name;
        private double _price;
        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }
        
        public double Price
        {
            get { return _price; }
            set { _price = value; }
        }
    }
}