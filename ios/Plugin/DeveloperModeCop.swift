import Foundation

@objc public class DeveloperModeCop: NSObject {
    @objc public func echo(_ value: String) -> String {
        print(value)
        return value
    }
}
