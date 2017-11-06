//**********************************************************************
// Copyright (c) 2017 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
package calculadoras;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora
{

    private JFrame myframe;
    private JTextField resultField;
    private double numero1;
    private double numero2;
    private double resultado;
    private String operacao;
    private String resposta;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Calculadora window = new Calculadora();
                    window.myframe.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Calculadora()
    {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
        myframe = new JFrame();
        myframe.setBounds(100, 100, 239, 334);
        myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myframe.getContentPane().setLayout(null);

        //Linha 0
        JButton btn7 = new JButton("7");
        btn7.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn7.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn7.setBounds(10, 80, 50, 50);
        myframe.getContentPane().add(btn7);

        JButton btn8 = new JButton("8");
        btn8.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn8.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn8.setBounds(60, 80, 50, 50);
        myframe.getContentPane().add(btn8);

        JButton btn9 = new JButton("9");
        btn9.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn9.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn9.setBounds(110, 80, 50, 50);
        myframe.getContentPane().add(btn9);

        JButton btnMultiplicar = new JButton("X");
        btnMultiplicar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                numero1 = Double.parseDouble(resultField.getText());
                limpaDisplay();
                operacao = "*";
            }
        });
        btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnMultiplicar.setBounds(160, 180, 50, 50);
        myframe.getContentPane().add(btnMultiplicar);

        //Linha 1
        resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setHorizontalAlignment(SwingConstants.RIGHT);
        resultField.setFont(new Font("Tahoma", Font.BOLD, 20));
        resultField.setBounds(10, 11, 197, 53);
        myframe.getContentPane().add(resultField);
        resultField.setColumns(10);

        JButton btn4 = new JButton("4");
        btn4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn4.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn4.setBounds(10, 130, 50, 50);
        myframe.getContentPane().add(btn4);

        JButton btn5 = new JButton("5");
        btn5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn5.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn5.setBounds(60, 130, 50, 50);
        myframe.getContentPane().add(btn5);

        JButton btn6 = new JButton("6");
        btn6.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn6.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn6.setBounds(110, 130, 50, 50);
        myframe.getContentPane().add(btn6);

        JButton btnSubtrair = new JButton("-");
        btnSubtrair.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                numero1 = Double.parseDouble(resultField.getText());
                limpaDisplay();
                operacao = "-";
            }
        });
        btnSubtrair.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSubtrair.setBounds(160, 130, 50, 50);
        myframe.getContentPane().add(btnSubtrair);

        //Linha 2
        JButton btn1 = new JButton("1");
        btn1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn1.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn1.setBounds(10, 180, 50, 50);
        myframe.getContentPane().add(btn1);

        JButton btn2 = new JButton("2");
        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn2.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn2.setBounds(60, 180, 50, 50);
        myframe.getContentPane().add(btn2);

        JButton btn3 = new JButton("3");
        btn3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn3.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn3.setBounds(110, 180, 50, 50);
        myframe.getContentPane().add(btn3);

        JButton btnSomar = new JButton("+");
        btnSomar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                numero1 = Double.parseDouble(resultField.getText());
                limpaDisplay();
                operacao = "+";
            }
        });
        btnSomar.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnSomar.setBounds(160, 80, 50, 50);
        myframe.getContentPane().add(btnSomar);

        //Linha 3
        JButton btn0 = new JButton("0");
        btn0.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btn0.getText();
                resultField.setText(EnterNumber);
            }
        });
        btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
        btn0.setBounds(10, 230, 50, 50);
        myframe.getContentPane().add(btn0);

        JButton btnVirgula = new JButton(".");
        btnVirgula.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String EnterNumber = resultField.getText() + btnVirgula.getText();
                resultField.setText(EnterNumber);
            }
        });
        btnVirgula.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnVirgula.setBounds(60, 230, 50, 50);
        myframe.getContentPane().add(btnVirgula);

        JButton btnDividir = new JButton("/");
        btnDividir.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                numero1 = Double.parseDouble(resultField.getText());
                limpaDisplay();
                operacao = "/";
            }
        });
        btnVirgula.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
            }
        });
        btnDividir.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnDividir.setBounds(160, 230, 50, 50);
        myframe.getContentPane().add(btnDividir);

        JButton btnIgual = new JButton("=");
        btnIgual.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                numero2 = Double.parseDouble(resultField.getText());
                limpaDisplay();
                executaOperacao();
                resultField.setText(resposta);
            }
        });
        btnIgual.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnIgual.setBounds(110, 230, 50, 50);
        myframe.getContentPane().add(btnIgual);
    }

    private void limpaDisplay()
    {
        resultField.setText("");
    }

    private void executaOperacao()
    {
        if (operacao.equalsIgnoreCase("+"))
        {
            resultado = numero1 + numero2;
            resposta = String.valueOf(resultado);
        }
        else if (operacao.equalsIgnoreCase("-"))
        {
            resultado = numero1 - numero2;
            resposta = String.valueOf(resultado);
        }
        else if (operacao.equalsIgnoreCase("*"))
        {
            resultado = numero1 * numero2;
            resposta = String.valueOf(resultado);
        }
        else if (operacao.equalsIgnoreCase("/"))
        {
            resultado = (numero2 != 0) ? numero1 / numero2 : 0;
            resposta = String.valueOf(resultado);
            //resposta = String.format("%.2f", resultado);
        }
    }
}
