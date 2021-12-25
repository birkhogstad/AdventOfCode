use std::fs::File;
use std::io::{self, prelude::*, BufReader};

fn main() -> io::Result<()> {
    let file = File::open("../input.txt")?;
    let reader = BufReader::new(file);

    for line in reader.lines() {
        let mut lsplit = line.ToString().split_whitespace();
        println!("{:?}", lsplit);
    }

    Ok(())
}
