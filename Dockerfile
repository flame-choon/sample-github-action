ARG JDK_VERSION=17-alpine
ARG APPLICATION=rest-application

ARG JDK_IMAGE=openjdk:${JDK_VERSION}
FROM ${JDK_IMAGE} AS rest-application

# ARG DOCKER_BUILD_ARCH=amd64
ENV ACTIVE_PROFILE=${PROFILE}

ARG APPLICATION=rest
ARG VERSION=0.0.1

ENV APPLICATION=${APPLICATION}
ENV VERSION=${VERSION}

RUN mkdir /app
RUN addgroup --system javauser && adduser -S -s /bin/false -G javauser javauser

WORKDIR /app
COPY ./bin/${APPLICATION}-${VERSION}.jar ./application.jar
RUN chown -R javauser:javauser /app
USER javauser

EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=${ACTIVE_PROFILE}", "-jar", "./application.jar"]
