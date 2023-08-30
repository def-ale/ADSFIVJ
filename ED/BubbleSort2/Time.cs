using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace BubbleSort2
{
    public class Time
    {
        private string _name;
        private int _position;
        private int _totalPoints;

        public string Name 
        {
            get { return _name; }
            set { _name = value; }
        }
        public int Position
        {
            get { return _position; }
            set { _position = value; }
        }
        public int TotalPoints
        {
            get { return _totalPoints; }
            set { _totalPoints = value; }
        }
    }
}