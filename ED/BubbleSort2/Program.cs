using BubbleSort2;

internal class Program
{
    private static void Main(string[] args)
    {
        Time[] times = new Time[5]
        {
            new Time { Name = "Vasco da Gama", Position = 18, TotalPoints = 16 },
            new Time { Name = "Athletico-PR", Position = 7, TotalPoints = 33 },
            new Time { Name = "Fluminense", Position = 5, TotalPoints = 35},
            new Time { Name = "Cruzeiro", Position = 12, TotalPoints = 25},
            new Time { Name = "Goiás", Position = 15, TotalPoints = 24}
        };

        foreach (var time in times)
        {
            Console.WriteLine($"{time.Name}");
        }

        Console.WriteLine("- Tabela -");
        BubbleSort.Ordena(times);
        foreach (var time in times)
        {
            Console.WriteLine($" Time:       {time.Name}");
            Console.WriteLine($" Posição:    {time.Position}");
            Console.WriteLine($" Pts totais: {time.TotalPoints}");
            Console.WriteLine();
        }
    }
}