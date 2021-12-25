use std::fs;

fn main() {

    let file_path = "../input.txt";


    let input = fs::read_to_string(file_path).unwrap();


    let mut _v: Vec<u16> = vec![0; 0];
    
    let mut t1c: u16 = 0;
    let mut t2c: u16 = 0;
    let mut c: u16;

    for s in input.split("\n") {
        c = s.parse::<u16>().unwrap();
        _v.push(c);
    }

    for i in 1.._v.len() {
        // Task 1 checker:
        if _v[i] > _v[i - 1] {
            t1c += 1;
        }
        // Task 2 checker:
        if i > 2 {
            if _v[i] > _v[i - 3] {
                t2c += 1;
            }
        }
    }
    

    println!("Task 1:  {} | Task 2:  {} ", t1c, t2c);








}
