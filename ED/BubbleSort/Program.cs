using BubbleSort;
internal class Program
{
    private static void Main(string[] args)
    {
        Product[] products = new Product[5]
        {
            new Product { Name = "TV", Price = 900.00 },
            new Product { Name = "Computer", Price = 1200.00 },
            new Product { Name = "Smartphone", Price = 1100.00 },
            new Product { Name = "Bike", Price = 650.00 },
            new Product { Name = "Console", Price = 1000.00 }
        };

        foreach ( var product in products )
        {
            Console.WriteLine($"{product.Name}");
        }

        BubbleSorting bs = new BubbleSorting(); 
        BubbleSorting.Ordenar(products);
        Console.WriteLine($"Produtos ordenados por preço");
        foreach ( var product in products )
        {
            Console.WriteLine($"Nome: {product.Name} - Preço: {product.Price}");
        }
    }
}