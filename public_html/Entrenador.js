const entrenadores = {
    yoga: {
        mañana: [
            { nombre: "Ana Torres", descripcion: "Instructor de Yoga Integral.", intensidad: "Baja", tarifa: "$25/h", horario: "7:30 AM a 9:30 AM" },
            { nombre: "Luis Ríos", descripcion: "Yoga Hatha.", intensidad: "Baja", tarifa: "$22/h", horario: "9:30 AM a 11:30 AM" },
            { nombre: "María López", descripcion: "Yoga Vinyasa.", intensidad: "Media", tarifa: "$28/h", horario: "10:30 AM a 12:00 PM" },
            { nombre: "Sofía Martínez", descripcion: "Yoga para principiantes.", intensidad: "Baja", tarifa: "$20/h", horario: "12:00 PM a 2:00 PM" },
            { nombre: "Pedro Sánchez", descripcion: "Yoga Restaurativo.", intensidad: "Baja", tarifa: "$23/h", horario: "12:00 PM a 2:00 PM" }
        ],
        tarde: [
            { nombre: "Claudia Romero", descripcion: "Yoga Dinámico.", intensidad: "Media", tarifa: "$26/h", horario: "12:00 PM a 2:00 PM" },
            { nombre: "Fernando Castro", descripcion: "Yoga Ashtanga.", intensidad: "Alta", tarifa: "$30/h", horario: "2:00 PM a 4:00 PM" },
            { nombre: "Isabel Vera", descripcion: "Yoga de la Risa.", intensidad: "Baja", tarifa: "$21/h", horario: "4:00 PM a 6:00 PM" },
            { nombre: "Carlos Mendoza", descripcion: "Yoga Iyengar.", intensidad: "Media", tarifa: "$27/h", horario: "4:00 PM a 6:00 PM" },
            { nombre: "Laura Jiménez", descripcion: "Yoga para la Flexibilidad.", intensidad: "Baja", tarifa: "$24/h", horario: "5:00 PM a 7:00 PM" }
        ],
        noche: [
            { nombre: "Juan Pérez", descripcion: "Yoga para el estrés.", intensidad: "Baja", tarifa: "$23/h", horario: "6:00 PM a 8:00 PM" },
            { nombre: "Jorge Herrera", descripcion: "Yoga Hatha.", intensidad: "Baja", tarifa: "$25/h", horario: "7:00 PM a 9:00 PM" },
            { nombre: "Angela Silva", descripcion: "Yoga para la concentración.", intensidad: "Media", tarifa: "$29/h", horario: "8:00 PM a 10:00 PM" },
            { nombre: "Ricardo Núñez", descripcion: "Yoga Aéreo.", intensidad: "Alta", tarifa: "$32/h", horario: "8:00 PM a 10:00 PM" },
            { nombre: "Teresa Ruiz", descripcion: "Yoga Terapéutico.", intensidad: "Baja", tarifa: "$20/h", horario: "9:00 PM a 11:00 PM" }
        ]
    },
    pesas: {
        mañana: [
            { nombre: "Fernando Díaz", descripcion: "Entrenador de Fuerza y Acondicionamiento.", intensidad: "Alta", tarifa: "$30/h", horario: "7:00 AM a 9:00 AM" },
            { nombre: "Daniela Torres", descripcion: "Entrenamiento Personalizado de Fuerza.", intensidad: "Alta", tarifa: "$28/h", horario: "8:00 AM a 10:00 AM" },
            { nombre: "Javier López", descripcion: "Entrenador de Musculación.", intensidad: "Alta", tarifa: "$32/h", horario: "9:00 AM a 11:00 AM" },
            { nombre: "Marta Ramírez", descripcion: "Entrenamientos de Resistencia.", intensidad: "Media", tarifa: "$26/h", horario: "10:00 AM a 12:00 PM" },
            { nombre: "Cristian Martínez", descripcion: "Entrenador de Levantamiento Olímpico.", intensidad: "Alta", tarifa: "$35/h", horario: "11:00 AM a 1:00 PM" }
        ],
        tarde: [
            { nombre: "Patricia Salas", descripcion: "Entrenadora de Fuerza para Mujeres.", intensidad: "Media", tarifa: "$25/h", horario: "12:00 PM a 2:00 PM" },
            { nombre: "Sergio Alvarado", descripcion: "Entrenador de Fuerza y Cardio.", intensidad: "Alta", tarifa: "$30/h", horario: "2:00 PM a 4:00 PM" },
            { nombre: "Laura Cortés", descripcion: "Entrenadora de Resistencia y Tonificación.", intensidad: "Media", tarifa: "$27/h", horario: "4:00 PM a 6:00 PM" },
            { nombre: "Andrés Valdés", descripcion: "Entrenador de Fuerza Funcional.", intensidad: "Alta", tarifa: "$31/h", horario: "5:00 PM a 7:00 PM" },
            { nombre: "Verónica Ruiz", descripcion: "Entrenadora de Culturismo.", intensidad: "Alta", tarifa: "$33/h", horario: "6:00 PM a 8:00 PM" }
        ],
        noche: [
            { nombre: "Carlos Álvarez", descripcion: "Entrenador de Potencia.", intensidad: "Alta", tarifa: "$34/h", horario: "6:00 PM a 8:00 PM" },
            { nombre: "Silvia Jiménez", descripcion: "Entrenadora de Tonificación.", intensidad: "Media", tarifa: "$26/h", horario: "7:00 PM a 9:00 PM" },
            { nombre: "Mario Gómez", descripcion: "Entrenador de CrossFit.", intensidad: "Alta", tarifa: "$38/h", horario: "8:00 PM a 10:00 PM" },
            { nombre: "Alejandra Castro", descripcion: "Entrenadora de Resistencia.", intensidad: "Media", tarifa: "$25/h", horario: "8:00 PM a 10:00 PM" },
            { nombre: "Esteban López", descripcion: "Entrenador de Musculación Avanzada.", intensidad: "Alta", tarifa: "$36/h", horario: "9:00 PM a 10:00 PM" }
        ]
    },
    cardio: {
        mañana: [
            { nombre: "Julia Ríos", descripcion: "Entrenadora de Cardio.", intensidad: "Media", tarifa: "$25/h", horario: "7:00 AM a 9:00 AM" },
            { nombre: "Héctor Castro", descripcion: "Entrenador de Entrenamiento de Resistencia.", intensidad: "Alta", tarifa: "$32/h", horario: "8:00 AM a 10:00 AM" },
            { nombre: "Laura Ramírez", descripcion: "Entrenadora de Aeróbicos.", intensidad: "Baja", tarifa: "$22/h", horario: "9:00 AM a 11:00 AM" },
            { nombre: "Fernando Sánchez", descripcion: "Entrenador de Cardio Intensivo.", intensidad: "Alta", tarifa: "$30/h", horario: "10:00 AM a 12:00 PM" },
            { nombre: "Lucía Medina", descripcion: "Entrenadora de Zumba.", intensidad: "Media", tarifa: "$28/h", horario: "11:00 AM a 1:00 PM" }
        ],
        tarde: [
            { nombre: "Claudia García", descripcion: "Entrenadora de HIIT.", intensidad: "Alta", tarifa: "$27/h", horario: "12:00 PM a 2:00 PM" },
            { nombre: "Sofía Moreno", descripcion: "Entrenadora de Aeróbicos.", intensidad: "Media", tarifa: "$25/h", horario: "2:00 PM a 4:00 PM" },
            { nombre: "Jorge Pérez", descripcion: "Entrenador de Cardio Box.", intensidad: "Alta", tarifa: "$31/h", horario: "4:00 PM a 6:00 PM" },
            { nombre: "Vanessa Jiménez", descripcion: "Entrenadora de Spinning.", intensidad: "Media", tarifa: "$28/h", horario: "5:00 PM a 7:00 PM" },
            { nombre: "Raúl Torres", descripcion: "Entrenador de Ciclismo.", intensidad: "Alta", tarifa: "$30/h", horario: "6:00 PM a 8:00 PM" }
        ],
        noche: [
            { nombre: "María Álvarez", descripcion: "Entrenadora de Cardio.", intensidad: "Media", tarifa: "$25/h", horario: "6:00 PM a 8:00 PM" },
            { nombre: "Diego Rodríguez", descripcion: "Entrenador de Entrenamiento Funcional.", intensidad: "Alta", tarifa: "$33/h", horario: "7:00 PM a 9:00 PM" },
            { nombre: "Elena Castro", descripcion: "Entrenadora de Zumba.", intensidad: "Media", tarifa: "$29/h", horario: "8:00 PM a 10:00 PM" },
            { nombre: "Nicolás Ramírez", descripcion: "Entrenador de HIIT.", intensidad: "Alta", tarifa: "$32/h", horario: "7:00 PM a 9:00 PM" },
            { nombre: "Patricia Hernández", descripcion: "Entrenadora de Aeróbicos.", intensidad: "Baja", tarifa: "$24/h", horario: "8:00 PM a 10:00 AM" }
        ]
    }
};
document.getElementById('mostrarTabla').addEventListener('click', function() {
            const especialidad = document.getElementById('especialidad').value;
            const horario = document.getElementById('horario').value;

            const tabla = document.getElementById('tablaEntrenadores');
            tabla.innerHTML = ''; // Limpiar tabla anterior

            if (especialidad && horario) {
                const entrenadoresDisponibles = entrenadores[especialidad][horario];
                let html = '<table><tr><th>Nombre</th><th>Descripción</th><th>Intensidad</th><th>Tarifa</th><th>Horario</th></tr>';

                entrenadoresDisponibles.forEach(entrenador => {
                    html += `<tr>
                        <td>${entrenador.nombre}</td>
                        <td>${entrenador.descripcion}</td>
                        <td>${entrenador.intensidad}</td>
                        <td>${entrenador.tarifa}</td>
                        <td>${entrenador.horario}</td>
                    </tr>`;
                });

                html += '</table>';
                tabla.innerHTML = html;
            } else {
                tabla.innerHTML = '<p style="color: red;">Por favor, selecciona una especialidad y un horario.</p>';
            }
        });