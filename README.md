![Logo image](img/sbtscalasamlogo_small.png)

# sam-seed.g8
A template project for quickly creating serverless applications. For more information see [sbt-sam](https://github.com/dnvriend/sbt-sam)

## Usage
Create a new template project by typing:

```
sbt new dnvriend/sam-seed.g8
```

## Deploy
To deploy the project type `samDeploy`

## Remove
To remove the project type `samRemove`

```bash
> samRemove
Deleting artifact version: 'fGdQFlKkf45tlSkP5mE0tqI_ubNqk2l.'
[info] Deleting cloud formation stack
[info] DELETE_IN_PROGRESS - AWS::Lambda::Permission - HelloLambdaHelloLambdaPermissionhello - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::S3::Bucket - SbtSamDeploymentBucket - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::ApiGateway::Stage - ServerlessRestApihelloStage - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::Lambda::Permission - HelloLambdaHelloLambdaPermissionTest - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::S3::Bucket - SbtSamDeploymentBucket - DELETE_COMPLETE -
[info] DELETE_IN_PROGRESS - AWS::ApiGateway::Stage - ServerlessRestApihelloStage - DELETE_COMPLETE -
[info] DELETE_IN_PROGRESS - AWS::ApiGateway::Deployment - ServerlessRestApiDeploymentad309a696b - DELETE_COMPLETE -
[info] DELETE_IN_PROGRESS - AWS::ApiGateway::Deployment - ServerlessRestApiDeploymentad309a696b - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::Lambda::Permission - HelloLambdaHelloLambdaPermissionhello - DELETE_COMPLETE -
[info] DELETE_IN_PROGRESS - AWS::Lambda::Permission - HelloLambdaHelloLambdaPermissionTest - DELETE_COMPLETE -
[info] DELETE_IN_PROGRESS - AWS::ApiGateway::RestApi - ServerlessRestApi - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::ApiGateway::RestApi - ServerlessRestApi - DELETE_COMPLETE -
[info] DELETE_IN_PROGRESS - AWS::Lambda::Function - HelloLambda - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::Lambda::Function - HelloLambda - DELETE_COMPLETE -
[info] DELETE_IN_PROGRESS - AWS::IAM::Role - HelloLambdaRole - DELETE_IN_PROGRESS -
[info] DELETE_IN_PROGRESS - AWS::IAM::Role - HelloLambdaRole - DELETE_COMPLETE -
[success] Total time: 23 s, completed Dec 24, 2017 2:16:03 PM
```

## Info
To get deployment information like available endpoints and stack information, type `samInfo`

```bash
> samInfo
[info] Stack details:
[info]
[info] ====================
[info] Sam's State:
[info] ====================
[info] Name: sam-seed-hello
[info] Description: No description
[info] Status: UPDATE_COMPLETE
[info] Status reason: No status reason
[info] Last updated: Sun Dec 24 13:46:15 CET 2017
[info] ===================
[info] ServiceEndpoint: https://qbyjx19aoa.execute-api.eu-west-1.amazonaws.com/hello
[info] ===================
[info]
[info] DynamoDbTables:
[info] SNS Topics:
[info] Kinesis Streams:
[info] Endpoints:
[info] GET - https://qbyjx19aoa.execute-api.eu-west-1.amazonaws.com/hello/hello
sam[success] Total time: 1 s, completed Dec 24, 2017 2:15:39 PM
```
