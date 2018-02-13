package rana;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;

public class view extends JFrame {

	model model = new model();
	String operand="";
	public view() {
		initComponents();
	}
	
	public void getOperands(JButton button)
	{
		operand+=button.getText();
		model.setopr(operand);
		resultText.setText(operand);
		
			
	}
	public void getoper(int oper)
	{
		model.setoper(oper);
		operand="";
	}
	public void FindResult() {
		DecimalFormat form=new DecimalFormat("#,###.########");
		model.FindOperation();
		resultText.setText(form.format(model.getResult())+"");
	}
	
	
	 private void initComponents()  {

	        jPanel3 = new javax.swing.JPanel();
	        buttonBagi = new javax.swing.JButton();
	        buttonKali = new javax.swing.JButton();
	        buttonKurang = new javax.swing.JButton();
	        buttonTambah = new javax.swing.JButton();
	        buttonAC = new javax.swing.JButton();
	        buttonModulus = new javax.swing.JButton();
	        buttonSeper = new javax.swing.JButton();
	        buttonSamaDengan = new javax.swing.JButton();
	        jPanel2 = new javax.swing.JPanel();
	        button7 = new javax.swing.JButton();
	        button4 = new javax.swing.JButton();
	        button1 = new javax.swing.JButton();
	        buttonKoma = new javax.swing.JButton();
	        button11 = new javax.swing.JButton();
	        button12 = new javax.swing.JButton();
	        button2 = new javax.swing.JButton();
	        button3 = new javax.swing.JButton();
	        button5 = new javax.swing.JButton();
	        button6 = new javax.swing.JButton();
	        button8 = new javax.swing.JButton();
	        button9 = new javax.swing.JButton();
	        jPanel1 = new javax.swing.JPanel();
	        resultText = new javax.swing.JLabel();

	        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	        setBackground(new java.awt.Color(255, 204, 204));
	        setResizable(false);

	        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

	        buttonBagi.setText("/");
	        buttonBagi.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonBagiActionPerformed(evt);
	            }
	        });

	        buttonKali.setText("*");
	        buttonKali.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonKaliActionPerformed(evt);
	            }
	        });

	        buttonKurang.setText("-");
	        buttonKurang.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonKurangActionPerformed(evt);
	            }
	        });

	        buttonTambah.setText("+");
	        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonTambahActionPerformed(evt);
	            }
	            
	        });

	        buttonAC.setText("AC");
	        buttonAC.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonACActionPerformed(evt);
	            }
	        });

	        buttonModulus.setText("%");
	        buttonModulus.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonModulusActionPerformed(evt);
	            }
	        });

	        buttonSeper.setText("sqrt");
	        buttonSeper.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonSeperActionPerformed(evt);
	            }
	        });

	        buttonSamaDengan.setText("=");
	        buttonSamaDengan.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonSamaDenganActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
	        jPanel3.setLayout(jPanel3Layout);
	        jPanel3Layout.setHorizontalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel3Layout.createSequentialGroup()
	                        .addComponent(buttonKali, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addGap(18, 18, 18)
	                        .addComponent(buttonModulus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                    .addGroup(jPanel3Layout.createSequentialGroup()
	                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
	                                .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(buttonSamaDengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
	                                .addComponent(buttonKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(buttonSeper))
	                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
	                                .addComponent(buttonBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addGap(18, 18, 18)
	                                .addComponent(buttonAC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
	                        .addGap(0, 0, Short.MAX_VALUE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel3Layout.setVerticalGroup(
	            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel3Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(buttonBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(buttonAC, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(buttonKali, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(buttonModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(buttonKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(buttonSeper, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(buttonSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

	        button7.setText("7");
	        button7.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button7ActionPerformed(evt);
	            }
	        });

	        button4.setText("4");
	        button4.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button4ActionPerformed(evt);
	            }
	        });

	        button1.setText("1");
	        button1.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button1ActionPerformed(evt);
	            }
	        });

	        buttonKoma.setText(".");
	        buttonKoma.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                buttonKomaActionPerformed(evt);
	            }
	        });

	        button11.setText("0");
	        button11.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button11ActionPerformed(evt);
	            }
	        });

	        button12.setText("C");
	        button12.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button12ActionPerformed(evt);
	            }
	        });

	        button2.setText("2");
	        button2.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button2ActionPerformed(evt);
	            }
	        });

	        button3.setText("3");
	        button3.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button3ActionPerformed(evt);
	            }
	        });

	        button5.setText("5");
	        button5.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button5ActionPerformed(evt);
	            }
	        });

	        button6.setText("6");
	        button6.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button6ActionPerformed(evt);
	            }
	        });

	        button8.setText("8");
	        button8.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button8ActionPerformed(evt);
	            }
	        });

	        button9.setText("9");
	        button9.addActionListener(new java.awt.event.ActionListener() {
	            @Override
				public void actionPerformed(java.awt.event.ActionEvent evt) {
	                button9ActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
	        jPanel2.setLayout(jPanel2Layout);
	        jPanel2Layout.setHorizontalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
	                    .addGroup(jPanel2Layout.createSequentialGroup()
	                        .addComponent(buttonKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        jPanel2Layout.setVerticalGroup(
	            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel2Layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(buttonKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );

	        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

	        resultText.setBackground(new java.awt.Color(255, 255, 255));
	        resultText.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 36)); // NOI18N
	        resultText.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
	        resultText.setText("0");

	        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
	        jPanel1.setLayout(jPanel1Layout);
	        jPanel1Layout.setHorizontalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(resultText, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
	                .addContainerGap())
	        );
	        jPanel1Layout.setVerticalGroup(
	            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanel1Layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(resultText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addContainerGap())
	        );

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
	        getContentPane().setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
	        );

	        pack();
	 }
	 private void buttonBagiActionPerformed(java.awt.event.ActionEvent evt) {                                
	   getoper(4);
	 }           
	 

	    private void buttonKaliActionPerformed(java.awt.event.ActionEvent evt) {                                           
	getoper(3);
	    }                                          

	    private void buttonKurangActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        getoper(2);
	    }                                            

	    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {                                             
	getoper(1);
	    }                                            

	    private void buttonACActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        operand="";
	        model.setoper(0);
	        model.setResult(0);
	        resultText.setText("");
	    }                                        

	    private void buttonModulusActionPerformed(java.awt.event.ActionEvent evt) {                                              
	        getoper(6);
	    }                                             

	    private void buttonSeperActionPerformed(java.awt.event.ActionEvent evt) {                                            
	        getoper(5);
	    }                                           

	    private void buttonSamaDenganActionPerformed(java.awt.event.ActionEvent evt) {                                                 
             FindResult();
	        
	    }                                                

	    private void button7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        getOperands(button7);
	    }                                       

	    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        getOperands(button4);
	    }                                       

	    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        getOperands(button1);
	    }                                       

	    private void buttonKomaActionPerformed(java.awt.event.ActionEvent evt) {                                           
	       getOperands(buttonKoma);
	    }                                          

	    private void button11ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        getOperands(button11);
	    }                                        

	    private void button12ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	      if(operand.length()>1) {
	    	  operand=operand.substring(0,operand.length()-1);
	    	  model.setopr(operand);
	    	  resultText.setText(operand);
	      }
	      else {
	    	  operand="";
	    	  model.setopr(operand);
	    	  resultText.setText("0");
	    	  
	      }
	    }                                        

	    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	       getOperands(button2);
	    }                                       

	    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	     getOperands(button3);
	    }                                       

	    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	       getOperands(button5);
	    }                                       

	    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	       getOperands(button6);
	    }                                       

	    private void button8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        getOperands(button8);
	    }                                       

	    private void button9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        getOperands(button9);
	    }                                       


	                     
	    private javax.swing.JButton button1;
	    private javax.swing.JButton button11;
	    private javax.swing.JButton button12;
	    private javax.swing.JButton button2;
	    private javax.swing.JButton button3;
	    private javax.swing.JButton button4;
	    private javax.swing.JButton button5;
	    private javax.swing.JButton button6;
	    private javax.swing.JButton button7;
	    private javax.swing.JButton button8;
	    private javax.swing.JButton button9;
	    private javax.swing.JButton buttonAC;
	    private javax.swing.JButton buttonBagi;
	    private javax.swing.JButton buttonKali;
	    private javax.swing.JButton buttonKoma;
	    private javax.swing.JButton buttonKurang;
	    private javax.swing.JButton buttonModulus;
	    private javax.swing.JButton buttonSamaDengan;
	    private javax.swing.JButton buttonSeper;
	    private javax.swing.JButton buttonTambah;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JPanel jPanel2;
	    private javax.swing.JPanel jPanel3;
	    private javax.swing.JLabel resultText;
	    // End of variables declaration                   
	}


