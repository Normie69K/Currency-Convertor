# Currency Converter Application

## Overview

This Java application is a command-line currency converter that allows users to convert an amount from one currency to another. The application provides a menu for selecting the source and target currencies, performs the conversion based on predefined exchange rates, and displays the result.

## Features

- **Currency Selection**: Choose from a list of currencies to convert from and to.
- **Amount Conversion**: Enter the amount to convert and get the converted value.
- **Basic Error Handling**: Handles invalid currency options and out-of-range input.

## Currencies Supported

1. **India** - Indian Rupee (INR)
2. **United States** - US Dollar (USD)
3. **Eurozone** - Euro (EUR)
4. **Japan** - Japanese Yen (JPY)
5. **Canada** - Canadian Dollar (CAD)

## How to Use

1. **Compile the Program**: 
   ```bash
   javac Currency.java
   ```

2. **Run the Program**:
   ```bash
   java Currency
   ```

3. **Follow the Prompts**:
   - The application will display a list of currencies.
   - Enter the number corresponding to the source currency.
   - Enter the number corresponding to the target currency.
   - Input the amount you want to convert.
   - The program will display the converted amount.

## Example

```
Select your current currency.
1. India           Indian Rupee   INR
2. United States   US Dollar      USD
3. Eurozone        Euro           EUR
4. Japan           Japanese Yen   JPY
5. Canada          Canadian Dollar CAD

Enter the value from 1-5: 1
Now select in which currency you want to convert (1-5): 2
Enter amount you want to convert: 100

Converted amount: 82.62
```

## Code Explanation

- **`Menu` Class**: Displays the list of available currencies.
- **`main` Method**:
  - Reads user input for currency selection and amount.
  - Validates the input options.
  - Performs the conversion using predefined exchange rates.
  - Prints the converted amount.

## Error Handling

- The program checks if the selected currency options are within the valid range (1-5).
- If an invalid option is entered, the program displays an error message and terminates.

## Future Enhancements

- Add more currencies and update conversion rates dynamically.
- Implement a graphical user interface (GUI) for a more interactive experience.
- Include additional features like historical exchange rates and currency formatting.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to adjust or expand the README according to your specific needs or any additional features you might add to the application.
