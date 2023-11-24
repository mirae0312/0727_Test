//
//  ViewController.swift
//  MyAction
//
//  Created by mirae on 11/20/23.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var mybutton: UIButton!
    @IBOutlet weak var helloLabel: UILabel!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func didTapMyButton(_ sender: Any) {
        print("배경색을 노란색으로 변경")
//        view.backgroundColor = .yellow
        helloLabel.text = "hello Leana"
    }
    
}

