# kotlin-js-lambda
PoC to see if one can compile Kotlin to JavaScript and run it in a AWS Lambda Function

## Status
It's alive!  

## To Run
 * Clone this project - `git clone git@github.com:floodfx/kotlin-js-lambda.git`
 * Install Node Kotlin Module Dependency - `cd js; npm i; cd ..`
 * Run Gradle Build (compiles Kotlin to JS) - `gradle build`
 * Create a Zip of the JS dir - `cd js; zip -q -r ../kotlin-js-lambda.zip *;cd ..`
 * Deploy using SAM 
   * `aws cloudformation package --template-file kotlin-js-lambda-sam.cf --s3-bucket <YOUR_S3_BUCKET> --output-template-file packaged-kotlin-js-lambda-sam.cf`
   * `aws cloudformation deploy --template-file packaged-kotlin-js-lambda-sam.cf --stack-name kotlin-js-lambda-stack --capabilities CAPABILITY_IAM`
 * Test the lambda function (can use console) - `aws lambda invoke --function-name arn:aws:lambda:YOUR_REGION:YOUR_ACCOUNT_ID:function:kotlin-js-lambda kotlin-js-lambda.txt`
 
## Feedback
Let me know how to improve on this...  Thanks!
