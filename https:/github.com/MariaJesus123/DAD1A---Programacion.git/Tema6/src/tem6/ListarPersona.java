package tem6;

import java.util.Scanner;

public class ListarPersona {
	public static void main(String[] args)
	{
		Scanner tc = new Scanner(System.in);
		
		//limite 5 personas
		final int MAX_PERSONAS = 5;
		
		String nombre, apellido;
		int edad, op;
		char sexo;
		boolean crear = false, datos = false, datosConcretos = false;
		
		//cramos objetos
		Persona personas = new Persona();
		//cramos array
		Persona[] listarPersonas = new Persona[MAX_PERSONAS];
		
		while (crear == true)
		{
			System.out.print("\nQuieres añadir una persona a la base de datos?");
			System.out.print("\n\t1--------> Listar personas");
			System.out.print("\n\t2--------> Borrar personas");
			System.out.print("\n\t2--------> Salir");
			op = tc.nextInt();
			
			switch (op)
			{	
				case 1:
	            {
	            	if(op == 1 & Persona.contarNuevaPersona() < MAX_PERSONAS)
		            
	            	{	System.out.print("\nCual es su nombre? ");
		                nombre = tc.nextLine();
		                
		                System.out.print("\nCual es su apellido?" );
		                apellido = tc.nextLine();
		                
		                System.out.print("\nCuantos años tiene?" );
		                edad = tc.nextInt();
		                
		                System.out.print("\nCual es su sexo (M) o (H)? ");
		                sexo = tc.next().charAt(0);
		                
		                listarPersonas[Persona.getNumPersona()] = (personas = new Persona(nombre, apellido, edad, sexo));
		                System.out.println(personas);
		                Persona.contarNuevaPersona();
		                
		                while(datos == true)
		                {
		                	System.out.print("\nQuieres cambiar algun dato?");
		        			System.out.print("\n\t1-------->  Ver datos");
		        			System.out.print("\n\t2-------->  Cambiar");
		        			System.out.print("\n\t3-------->  Salir");
		        			
		        			op = tc.nextInt();
		        			
		        			switch (op)
		        			{	
		        				case 1:
		        	            {
		        	            	System.out.print(personas);
		                            break;
		        	            }
		        				case 2:
		                        {   
		                        	while(datosConcretos == true)
		                        	{
			                        	System.out.print("\n¿Que quieres cambiar?");
			                        	System.out.print("\n\t1--> Nombre");
			                        	System.out.print("\n\t2--> Apellido");
			                        	System.out.print("\n\t3--> Edad");
			                        	System.out.print("\n\t4--> Sexo");
			                        	System.out.print("\n\t5--> Salir");
	                                            
			                        	op = tc.nextInt();
			                        	switch (op)
					        			{	
					        				case 1:
					        	            {
					        	            	System.out.print("\nNuevo nombre");
			                                    nombre = tc.nextLine();
			                                    
			                                    personas.setNombre(nombre);
			                                    listarPersonas[Persona.getNumPersona() -1] = personas;
			                                    
			                                    break;
					        	            }
					        				case 2:
					        	            {
					        	            	System.out.print("\nNuevo apellido");
			                                    apellido = tc.nextLine();
			                                    
			                                    personas.setApellido(apellido);
			                                    listarPersonas[Persona.getNumPersona() -1] = personas;
			                                    
			                                    break;
					        	            }
					        				case 3:
					        	            {
					        	            	System.out.print("\nNueva edad");
			                                    edad = tc.nextInt();
			                                    
			                                    personas.setEdad(edad);
			                                    listarPersonas[Persona.getNumPersona() -1] = personas;
			                                    
			                                    break;
					        	            }
					        				case 4:
					        	            {
					        	            	System.out.print("\nNuevo genero");
			                                    sexo = tc.next().charAt(0);
			                                    
			                                    personas.setSexo(sexo);
			                                    listarPersonas[Persona.getNumPersona() -1] = personas;
			                                    
			                                    break;
					        	            }
					        				case 5:
					        	            {
					        	            	 datosConcretos = false;
						                         break;
					        	            }
					        				default:
					        	            {
					        	            	System.out.print("\nNo ha elegido ninguna de las opciones");
					                            break;
					        	            }
					        			}
				        	         }
		                             break;
		                        }
		        				case 3:
		                        {                            
		                            datos = false;
		                            break;
		                        }
		        				default:
		                        {                            
		                        	System.out.print("\nNo ha elegido ninguna de las opciones");
		                            break;
		                        }
		        	            
		        	         }
		                }
	            	}
	            	break;
	            }
	            
				case 2:
				{	
						int n = 0;
					 while ( n < Persona.getNumPersona())
                     {                    
                         System.out.printf("\n%d--> %s %s %d %s", n, listarPersonas[n].getNombre(), listarPersonas[n].getApellido(),
                        		 listarPersonas[n].getEdad(), listarPersonas[n].getApellido(), listarPersonas[n].getSexo());
                         n++;
                     }
                     
				}
				default: 
				{
					System.out.print("\nNo ha elegido ninguna de las opciones");
					break;
				}
				
			}
			
					
		}
		tc.close();
	}

}
